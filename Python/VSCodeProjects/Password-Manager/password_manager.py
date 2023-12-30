import csv
import os

class PasswordManager:
    def __init__(self):
        self.password_store = {}

    def store_credentials(self, website, username, password):
        if website in self.password_store:
            self.password_store[website].append((username, password))
        else:
            self.password_store[website] = [(username, password)]

    def get_credentials(self, website):
        return self.password_store.get(website, [])

    def save_data(self, filename):
        with open(filename, 'w', newline='') as file:
            writer = csv.writer(file)
            for website, credentials in self.password_store.items():
                for username, password in credentials:
                    writer.writerow([website, username, password])

    def load_data(self, filename):
        if os.path.exists(filename):
            with open(filename, 'r', newline='') as file:
                reader = csv.reader(file)
                for row in reader:
                    website, username, password = row
                    self.store_credentials(website, username, password)

def main():
    filename = "password_manager.csv"
    password_manager = PasswordManager()

    # Intentar cargar datos previos desde el archivo
    password_manager.load_data(filename)

    while True:
        print("Gestor de contraseñas")
        print("1. Almacenar credenciales")
        print("2. Recuperar credenciales")
        print("3. Guardar y salir")
        choice = input("Elija una opción: ")

        if choice == "1":
            website = input("Sitio web: ")
            username = input("Nombre de usuario: ")
            password = input("Contraseña: ")
            password_manager.store_credentials(website, username, password)
            print("Credenciales almacenadas con éxito.")
        elif choice == "2":
            website = input("Sitio web: ")
            credentials = password_manager.get_credentials(website)
            if credentials:
                for i, (username, password) in enumerate(credentials, 1):
                    print(f"Credencial {i}:")
                    print(f"Nombre de usuario: {username}")
                    print(f"Contraseña: {password}")
            else:
                print("No se encontraron credenciales para este sitio web.")
        elif choice == "3":
            password_manager.save_data(filename)
            print("Datos guardados. Saliendo del gestor de contraseñas.")
            break
        else:
            print("Opción no válida.")

if __name__ == "__main__":
    main()
