import json
from os import path
from getDate import getDate

filePath = "C:\\Users\\31391\\Desktop\\OOP\\att\\note.json"

def adding(id) :

    title= input("Укажите заголовок заметки: ")
    body= input("Введите тело заметки: ")
    entry = { "id" : id,
            "date": getDate(),
            "title": title, 
            "body": body
        }
    try :

        if path.isfile(filePath) is False :
            with open(filePath, "a", encoding="utf-8") as file :
                jsonData = {'data':[]}
                jsonData['data'].append(entry)
                json.dump(jsonData, file, indent=4)
        else: 
            with open(filePath, "r+", encoding="utf-8") as file :
                loadJson = json.load(file)
                loadJson['data'].append(entry)
                file.seek(0)
                json.dump(loadJson, file, indent=4)                  

        return 1
    except :
        return -1


