import json
from actionsFile import searchNoteDef
from actionsFile import writeNoteDef
from actionsFile import readeNoteDef

filePath = "C:\\Users\\31391\\Desktop\\OOP\\att\\note.json"

def delete() :
    deleteId = int(input("\nУкажите номер записи которую Вы хотели бы удалить: "))

    try :
        loadJson = readeNoteDef()
                
        el = searchNoteDef(deleteId, loadJson)
        loadJson['data'].remove(el['text'])
        if el["res"] == -1 :
            return 0
        return writeNoteDef(loadJson)

    except :
        return {"res":-1, "text": None}
    


