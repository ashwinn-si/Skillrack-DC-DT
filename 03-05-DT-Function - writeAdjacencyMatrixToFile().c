#include <stdio.h>
#include <stdlib.h>

void writeAdjacencyMatrixToFile(int N , int E , int edges_array[E][2]){
    
    int adjacency_matrix[N][N];
    
    for(int i = 0 ; (i < N) ; i++){
        
        for(int j = 0 ; (j < N) ; j++){
            
            adjacency_matrix[i][j] = 0;
        }
    }
    
    for(int i = 0 ; (i < E) ; i++){
        
        int node_1 = (edges_array[i][0] - 1);
        
        int node_2 = (edges_array[i][1] - 1);
        
        adjacency_matrix[node_1][node_2] = 1;
    }
    
    FILE *file_pointer = fopen("adjacencymatrix.txt" , "w");
    
    for(int i = 0 ; (i < N) ; i++){
        
        for(int j = 0 ; (j < N) ; j++){
            
            fprintf(file_pointer , "%d " , adjacency_matrix[i][j]);
        }
        
        fprintf(file_pointer , "\n");
    }
    
    fclose(file_pointer);
}

void outputAdjacencyMatrixFile(){
    
    FILE *fp = fopen("adjacencymatrix.txt","r");
    
    char ch;
    
    while((ch = fgetc(fp)) != EOF){
        printf("%c", ch);
    }
    
    fclose(fp);
}

int main(){
    
    int N, E;
    
    scanf("%d %d", &N, &E);
    
    int edges[E][2];
    
    for(int index = 0; index < E; index++){
        scanf("%d %d", &edges[index][0], &edges[index][1]);
    }
    
    writeAdjacencyMatrixToFile(N, E, edges);
    
    printf("Adjacency Matrix:\n");
    
    outputAdjacencyMatrixFile();
    
    return 0;
}