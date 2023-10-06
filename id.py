import json
from os import path


filePath = "C:\\Users\\31391\\Desktop\\OOP\\att\\note.json"

def getId () :
    if path.isfile(filePath) is False :
        return 0
    else :
        with open(filePath, 'r', encoding="utf-8") as fileR :
            jsonData = json.load(fileR)
            if len(jsonData) == 0 :
                return 0
            else :
                return jsonData['data'][-1]['id']