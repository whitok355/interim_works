import datetime

def getDate() :

    date = datetime.date.today()
    current_date_time = datetime.datetime.now()
    current_time = current_date_time.time()

    return f'дата {date} время {current_time.hour}:{current_time.minute}:{current_time.second}'
