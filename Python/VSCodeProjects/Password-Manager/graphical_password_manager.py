import sys
import csv
from PyQt5.QtWidgets import QApplication, QMainWindow, QLabel, QLineEdit, QPushButton, QVBoxLayout, QWidget, QMessageBox

class PasswordManagerGUI(QMainWindow):
    def __init__(self):
        super().__init__()

        self.password_manager = PasswordManager()
        self.init_ui()

    def init_ui(self):
        self.setWindowTitle("Gestor de Contraseñas")
        self.setGeometry(100, 100, 400, 200)

        self.central_widget = QWidget()
        self.setCentralWidget(self.central_widget)

        self.layout = QVBoxLayout()

        self.website_label = QLabel("Sitio web:")
        self.website_entry = QLineEdit()
        self.layout.addWidget(self.website_label)
        self.layout.addWidget(self.website_entry)

        self.username_label = QLabel("Nombre de usuario:")
        self.username_entry = QLineEdit()
        self.layout.addWidget(self.username_label)
        self.layout.addWidget(self.username_entry)

        self.password_label = QLabel("Contraseña:")
        self.password_entry = QLineEdit()
        self.password_entry.setEchoMode(QLineEdit.Password)
        self.layout.addWidget(self.password_label)
        self.layout.addWidget(self.password_entry)

        self.store_button = QPushButton("Almacenar")
        self.store_button.clicked.connect(self.store_credentials)
        self.layout.addWidget(self.store_button)

        self.retrieve_button = QPushButton("Recuperar")
        self.retrieve_button.clicked.connect(self.retrieve_credentials)
        self.layout.addWidget(self.retrieve_button)

        self.central_widget.setLayout(self.layout)

    def store_credentials(self):
        website = self.website_entry.text()
        username = self.username_entry.text()
        password = self.password_entry.text()
        if website and username and password:
            self.password_manager.store_credentials(website, username, password)
            self.password_manager.save_data()
            QMessageBox.information(self, "Información", "Credenciales almacenadas con éxito.")
        else:
            QMessageBox.warning(self, "Advertencia", "Por favor, complete todos los campos.")

    def retrieve_credentials(self):
        website = self.website_entry.text()
        credentials = self.password_manager.get_credentials(website)
        if credentials:
            message = "Credenciales encontradas:\n\n"
            for username, password in credentials:
                message += f"Nombre de usuario: {username}\nContraseña: {password}\n\n"
            QMessageBox.information(self, "Credenciales", message)
        else:
            QMessageBox.warning(self, "Advertencia", "No se encontraron credenciales para este sitio web.")

class PasswordManager:
    def __init__(self):
        self.filename = "passwords.csv"
        self.password_store = []
        self.load_data()

    def store_credentials(self, website, username, password):
        self.password_store.append((website, username, password))
        self.save_data()

    def get_credentials(self, website):
        return [(username, password) for w, username, password in self.password_store if w == website]

    def save_data(self):
        with open(self.filename, 'w', newline='') as file:
            writer = csv.writer(file)
            writer.writerows(self.password_store)

    def load_data(self):
        try:
            with open(self.filename, 'r', newline='') as file:
                reader = csv.reader(file)
                self.password_store = list(reader)
        except FileNotFoundError:
            pass

if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = PasswordManagerGUI()
    window.show()
    sys.exit(app.exec_())
