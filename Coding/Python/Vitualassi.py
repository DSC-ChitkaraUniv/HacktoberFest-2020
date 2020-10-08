import pyttsx3
import speech_recognition as sr 
import datetime
import wikipedia 
import webbrowser 
import os
import smtplib

print("Initializing Charlotte")

MASTER = "Anubhav"
engine = pyttsx3.init('sapi5')
voices = engine.getProperty('voices')
engine.setProperty('voice', voices[1].id)
# speak function will prounce the string which is passed to it.
def speak(text):
    engine.say(text)
    engine.runAndWait()

#This Function will wish you as per the given time
def wishMe():
    hour = int(datetime.datetime.now().hour)
   
    if hour>=0 and hour <12:
        speak("Good Morning Mr." + MASTER)

    elif hour>=12 and hour <18:
        speak("Good Afternoon Mr." + MASTER)

    else:
        speak("Good Evening Mr." + MASTER)
       
    #speak("I am Charlotte. How may i help You?")

# This function will take command from microphone
def takeCommand():
    r = sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening...")
        r.pause_threshold = 1
        audio = r.listen(source)

    try:
        print("Recognizing...")
        query = r.recognize_google(audio, language= 'en-in')
        print(f"user said: {query}\n")

    except exception as e:
        print("Say that again please")
        query = None
    return query

def main():
    # Main function start here..
    speak("Initialising Charlotte....")
    wishMe()
    query = takeCommand()

    #logic for executing task as per query
    if 'wikipedia' in query.lower():
        speak('Searching wikipedia...')
        query = query.replace("wikipedia", "")
        results = wikipedia.summary(query, sentences=4)
        speak("According to wikipedia")
        print(results)
        speak(results)

    elif 'open youtube' in query.lower():
        #webbrowser.open("youtube.com")
        url = "youtube.com"
        browser_path = "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe %s"
        webbrowser.get(browser_path).open(url)

    elif 'open google' in query.lower():
        #webbrowser.open("youtube.com")
        url = "google.com"
        browser_path = "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe %s"
        webbrowser.get(browser_path).open(url)  

    elif 'open reddit' in query.lower():
        #webbrowser.open("youtube.com")
        url = "reddit.com"
        browser_path = "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe %s"
        webbrowser.get(browser_path).open(url) 
    elif 'the time' in query.lower():
        strTime = datetime.datetime.now().strftime("%H:%M:%S")
        speak(f"{MASTER} the time is {strTime}")
    