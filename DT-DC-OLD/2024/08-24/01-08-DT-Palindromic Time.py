def palindrome_checker(secs):
    res_hr=(secs//3600)
    res_min=((secs-(secs//3600*3600))//60)
    
    #condition checker
    
    if(res_hr<10):
        res_hr='0'+str(res_hr)
    else:
        res_hr=str(res_hr)
    if(res_min<10):
        res_min='0'+str(res_min)
    else:
        res_min=str(res_min)
        
    res_string=res_hr+":"+res_min
    if(res_string==res_string[::-1]):
        print(res_string)
        return(True)
    return(False)
    
hours,mins=map(int,input().strip().split(":"))
total_sec=(hours*3600)+(mins*60)+60
while(True):
    if(palindrome_checker(total_sec)):
        quit()
    else:
        if(total_sec==86400):
            total_sec=0
        else:
            total_sec+=60
