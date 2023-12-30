package ags.vscode;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class App implements Serializable {
    private static final long serialVersionUID = 1L;
    private Map<String, Map<String, String>> passwordStore;

    /**
     *  xd
     */
    public App() {
        passwordStore = new HashMap<>();
    }

    public void storeCredentials(String website, String username, String password) {
        Map<String, String> credentials = new HashMap<>();
        credentials.put("username", username);
        credentials.put("password", password);
        passwordStore.put(website, credentials);
    }

    public Map<String, String> getCredentials(String website) {
        return passwordStore.get(website);
    }

    public static void main(String[] args) {
        App passwordManager;

        // Intentar cargar datos previos desde el archivo
        try (FileInputStream fileIn = new FileInputStream("passwordManager.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            passwordManager = (App) objectIn.readObject();
        } catch (IOException | ClassNotFoundException e) {
            passwordManager = new App();
        }

        while (true) {
            String[] options = { "Almacenar credenciales", "Recuperar credenciales", "Guardar y salir" };
            int choice = JOptionPane.showOptionDialog(
                null,
                "Gestor de contraseñas",
                "Seleccione una opción",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
            );

            switch (choice) {
                case 0:
                    String website = JOptionPane.showInputDialog("Sitio web:");
                    String username = JOptionPane.showInputDialog("Nombre de usuario:");
                    String password = JOptionPane.showInputDialog("Contraseña:");
                    passwordManager.storeCredentials(website, username, password);
                    JOptionPane.showMessageDialog(null, "Credenciales almacenadas con éxito.");
                    break;
                case 1:
                    website = JOptionPane.showInputDialog("Sitio web:");
                    Map<String, String> storedCredentials = passwordManager.getCredentials(website);
                    if (storedCredentials != null) {
                        String retrievedUsername = storedCredentials.get("username");
                        String retrievedPassword = storedCredentials.get("password");
                        JOptionPane.showMessageDialog(
                            null,
                            "Nombre de usuario: " + retrievedUsername + "\nContraseña: " + retrievedPassword
                        );
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontraron credenciales para este sitio web.");
                    }
                    break;
                case 2:
                    // Guardar datos en el archivo antes de salir
                    try (FileOutputStream fileOut = new FileOutputStream("passwordManager.ser");
                         ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                        objectOut.writeObject(passwordManager);
                        JOptionPane.showMessageDialog(null, "Datos guardados. Saliendo del gestor de contraseñas.");
                        System.exit(0);
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error al guardar los datos.");
                        e.printStackTrace();
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}
