import pytube
import youtube_downloader
import file_converter

print('''
¿Selecciona una de estas opciones?

(1) Descargar videos de Youtube manualmente
(2) Descargar playlist de youtube y convertirlo a mp3
(3) Descargar videos de Youtube y convertirlo en mp3

''')

choice = input("Choice: ")

if choice == "1" or choice == "2":
    quality = input("Elige una calidad (baja, media, alta, muy alta): ")
    if choice == "2":
        link = input("Introduce el link de la playlist: ")
        print("Descargando...")
        youtube_downloader.download_playlist(link, quality)
        print("Descarga Finalizada")
    if choice == "1":
        links = youtube_downloader.input_links()
        for link in links:
            filename = youtube_downloader.download_video(link, quality)
            print("Convertiendo...")
            file_converter.convert_to_mp3(filename)
            print("Conversión Finalizada")
elif choice == "3":
    links = youtube_downloader.input_links()
    for link in links:
        print("Descargando...")
        filename = youtube_downloader.download_video(link, 'low')
        print("Convertiendo...")
        file_converter.convert_to_mp3(filename)
        print("Conversión Finalizada")
else:
    print("Entrada inválida, terminando...")
