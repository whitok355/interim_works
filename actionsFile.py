import json

filePath = "C:\\Users\\31391\\Desktop\\OOP\\att\\note.json"

def readeNoteDef() :
     with open(filePath, 'r', encoding="utf-8") as fileR:
         return json.load(fileR) 

def searchNoteDef(id, jsonLoad) :

    for el in jsonLoad['data'] :
        if (el['id'] == id) :
            return {
                "res": 1, 
                "text": el
            }
    return {
        "res": -1, 
        "text": None
        }

def writeNoteDef(loadJson) :
    with open(filePath, 'w', encoding="utf-8") as fileW:
        json.dump(loadJson, fileW, indent=4)
        return 1
