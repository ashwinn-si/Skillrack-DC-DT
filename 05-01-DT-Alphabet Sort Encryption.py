#Your code below
string = input().strip()
ori_code = input().strip()
code = sorted(list(ori_code))
step_1 = [code.index(i)+1 for i in ori_code]
step_2 = sorted([[string[i],step_1[i%len(code)]] for i in range(len(string))],key = lambda x:x[1])
print(''.join(i[0] for i in step_2))