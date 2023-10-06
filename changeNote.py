import json
from actionsFile import searchNoteDef
from actionsFile import writeNoteDef
from actionsFile import readeNoteDef

filePath = "C:\\Users\\31391\\Desktop\\OOP\\att\\note.json"

def changeNoteDef() :
    changeId = int(input("Укажите идентификатор изменяемой заметки: "))

    loadJson = readeNoteDef()
    el = searchNoteDef(changeId, loadJson)

    if el['res'] > 0 :
        typeChange = int(input("\nЧто хотите изменить 1- заголовок 2- тело сообщения 3 - ничего: "))

        if typeChange == 1 :
            el['text']['title'] = input("\nВведите новый заголовок: ")

            return writeNoteDef(loadJson)
        elif typeChange == 2 :
            el['text']['body'] = input("\nВведите новый тело заметки: ")

            return writeNoteDef(loadJson)
        elif typeChange == 3 :
            return 0
        
    else :
        return -1
