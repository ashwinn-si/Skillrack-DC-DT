#without using extra space
R , C = map(int,input().split())
matrix = [input().strip().split() for i in range(R)]
sub_matrix_count = 0
res = []

for i in range(1 , R , 3):
    for j in range(1 , C , 3):
        res.append([matrix[i][j] , sub_matrix_count])
        sub_matrix_count+=1
        
res = sorted(res, key = lambda x : (x[0], x[1]))

for i in range (0, len(res), (len(res)//(R//3))):
    curr_row_elements = res[i:i+(C//3)]
    for row in range(3): # rows count
        for element in curr_row_elements:
            element_row = element[1] // (C//3)
            element_col = element[1] % (C//3)
            for j in range(element_col*3 , element_col*3 + 3):
                print(matrix[(element_row*3) + row][j] , end = " ")
        print()