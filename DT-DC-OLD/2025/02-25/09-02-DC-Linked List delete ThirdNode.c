struct Node* deleteThirdNode(struct Node *head)
{
    int counter = 0;
    struct Node *originialHead = head;
    while(counter != 1){
        head = head->next;
        counter++;
    }
    
    //if there is only three nodes
    
    if(head->next->next == NULL){
        head->next = NULL;
    }else{
        // struct Node *freeNode = head->next;
        head->next = head->next->next;
        // free(freeNode);
    }
    return originialHead;

}