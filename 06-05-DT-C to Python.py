while(True):
    
    try:
        
        string = input().strip()
        
        answer_string = string
        
        for index , character in enumerate(string):
            
            if(character.isdigit()):
                
                answer_string = string[ : index]
                
                break
        
        print((answer_string) if(answer_string) else (-1))
    
    except:
        
        break