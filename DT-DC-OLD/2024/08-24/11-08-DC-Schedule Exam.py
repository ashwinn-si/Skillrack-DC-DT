# 6 test cases failed
no_lab,no_machines=map(int,input().split())
lab_machine_count=[]
check_flag_machine=True
for i in range(no_lab):
    lab_machine_sats=input().split()
    working_machine_count=lab_machine_sats.count('1')
    faulty_machine_count=lab_machine_sats.count('0')
    if(working_machine_count>faulty_machine_count):
        lab_machine_count.append(working_machine_count)
        check_flag_machine=False
total_no_students=int(input())
lab_machine_count=sorted(lab_machine_count) #sorting so that we will use only minimum no of labs
if(check_flag_machine):
    print(-1)
    quit()
result_labs=[]
while(total_no_students>0):
    curr_batch_count=0
    no_labs_used=0
    for count in lab_machine_count:
        curr_batch_count+=count
        if(curr_batch_count>total_no_students):
            break
        if(curr_batch_count==total_no_students):
            no_labs_used+=1
            break
        no_labs_used+=1
    result_labs.append(no_labs_used)
    total_no_students-=curr_batch_count
print(len(result_labs))
print(*result_labs)
