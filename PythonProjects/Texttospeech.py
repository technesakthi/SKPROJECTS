import tkinter as tk
from gtts import gTTS
import tempfile
import pygame
from pygame import mixer
pygame.mixer.init()
def text_to_speech():
    text = entry.get()
    if text:
        tts = gTTS(text=text, lang='en', slow=False)
        with tempfile.NamedTemporaryFile(delete=False, suffix=".mp3") as temp_audio_file:
            tts.save(temp_audio_file.name)
            temp_file_path = temp_audio_file.name
        pygame.mixer.music.load(temp_file_path)2222
        pygame.mixer.music.play()
def stop_audio():
    pygame.mixer.music.stop()
root = tk.Tk()
root.title("Text-to-Speech Converter (SK)")
entry_label = tk.Label(root, text=" [Google Sister voice]\nEnter text:")
entry_label.pack(pady=10)
entry = tk.Entry(root, width=60)
entry.pack(pady=10)
play_button = tk.Button(root, text="Play", command=text_to_speech)
play_button.pack(pady=10)
stop_button = tk.Button(root, text="Stop", command=stop_audio)
stop_button.pack(pady=10)
root.mainloop()


