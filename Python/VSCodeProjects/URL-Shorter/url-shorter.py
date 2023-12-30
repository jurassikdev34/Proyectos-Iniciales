import pyshorteners
import PySimpleGUI as sg

def acortar_url(long_url):
    s = pyshorteners.Shortener()
    short_url = s.tinyurl.short(long_url)
    return short_url

# Definir el diseño de la interfaz gráfica
layout = [
    [sg.Text("Introduce tu URL larga:")],
    [sg.InputText(key="long_url")],
    [sg.Button("Acortar URL"), sg.Button("Salir")],
    [sg.Text("", size=(30, 1), key="resultado")]
]

# Crear la ventana de la interfaz gráfica
window = sg.Window("Acortador de URL", layout)

# Bucle de eventos de la interfaz gráfica
while True:
    event, values = window.read()

    if event == sg.WIN_CLOSED or event == "Salir":
        break
    elif event == "Acortar URL":
        long_url = values["long_url"]
        short_url = acortar_url(long_url)
        window["resultado"].update(f"URL Acortada: {short_url}")

# Cerrar la ventana de la interfaz gráfica al salir
window.close()
