import json

from actionsFile import searchNoteDef
from actionsFile import readeNoteDef

filePath = "C:\\Users\\31391\\Desktop\\OOP\\att\\note.json"

def readeDef() :
    readId = int(input("\nУкажите идентификатор сообения, который Вы хотите прочитать: "))

    loadJson = readeNoteDef()
    res = searchNoteDef(readId, loadJson)

    return res
