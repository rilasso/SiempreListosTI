import time
import os

def main():
    times()
    
    
def times():
    var = time.localtime()
    i = 0
    sec = var.tm_sec
    min = var.tm_min
    hour = var.tm_hour 
    day = var.tm_mday 
  
    while i < 1000000:
        i += 1
        if sec >= 59:
            sec = 0
            if min >= 59:
                min = 0
                os.system('clear')
                print(hour,":", min, ":", sec)
                if hour > 24:
                    hour = 0
                    day += 1
                    os.system('clear')
                    print(hour,":", min, ":", sec)
                else: 
                    hour += 1
            else:
                min += 1
                os.system('clear')
                print(hour,":", min, ":", sec)
        else:
            sec += 1
            os.system('clear')
            print(hour,":", min, ":", sec)
            time.sleep(0.65)
            

if __name__ == "__main__":
    main()