from action import action
from id import getId 

flag = True
id = getId()

print(id)

while(flag) :
    try :
        answer = int(input("\nВы хотите внести заметку? 1- хочу 0 - не хочу "))
        if answer == 1 :
            action(id)
            flag = False
        elif answer == 0 :
            print("\nДо новых встреч ")
            flag = False
        else :
            print("\nПожалуйста введите либо 1- хочу 0 - не хочу ")
    except :
        print("\nВведите числовое значение 1- хочу 0 - не хочу ")


