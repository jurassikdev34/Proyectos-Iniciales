    

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaEntrada entrada = new VentanaEntrada();
            entrada.setVisible(true);
        });
    }

    @Override
    public String toString() {
        return "App []";
    }
}

class VentanaEntrada extends JFrame {
    private JTextField urlField;
    private JButton acortarButton;

    public VentanaEntrada() {
        setTitle("Acortador de URL - Entrada");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);

        JPanel panel = new JPanel();
        urlField = new JTextField(30);
        acortarButton = new JButton("Acortar");

        panel.add(new JLabel("Introduce la URL que deseas acortar:"));
        panel.add(urlField);
        panel.add(acortarButton);

        acortarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String longURL = urlField.getText();
                if (longURL != null && !longURL.isEmpty()) {
                    try {
                        URL url = new URL("http://tinyurl.com/api-create.php?url=" + longURL);
                        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                        connection.setRequestMethod("GET");

                        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                        String shortURL = reader.readLine();
                        reader.close();

                        VentanaResultado resultado = new VentanaResultado(shortURL);
                        resultado.setVisible(true);
                        dispose(); // Cierra la ventana de entrada
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error al acortar la URL", "Error", JOptionPane.ERROR_MESSAGE);
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "URL no válida", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(panel);
    }
}

class VentanaResultado extends JFrame {
    private JTextArea resultadoTextArea;
    private JButton copiarButton;

    public VentanaResultado(String shortURL) {
        setTitle("Acortador de URL - Resultado");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        resultadoTextArea = new JTextArea(5, 30);
        resultadoTextArea.setEditable(false);
        resultadoTextArea.setText("URL acortada:\n" + shortURL);

        copiarButton = new JButton("Copiar al Portapapeles");
        panel.add(resultadoTextArea);
        panel.add(copiarButton);

        copiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringSelection stringSelection = new StringSelection(shortURL);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
                JOptionPane.showMessageDialog(null, "URL acortada copiada al portapapeles.", "Copia Exitosa", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        add(panel);
    }
}
