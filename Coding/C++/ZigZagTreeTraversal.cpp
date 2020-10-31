void zigZagOrder(BinaryTreeNode<int> *root) {
    
    stack<BinaryTreeNode<int>*> s1;
    stack<BinaryTreeNode<int>*> s2;
    s1.push(root);
    int currentLevelRemaining = 1;
    int nextLevelCount = 0;
    bool flag=true;
    while(currentLevelRemaining!=0){
        if(flag){
            BinaryTreeNode<int>* temp = s1.top();
            s1.pop();
            cout<<temp->data<<" ";
            currentLevelRemaining--;
            if(temp->left!=NULL){
                s2.push(temp->left);
                nextLevelCount++;
            }
            if(temp->right!=NULL){
                s2.push(temp->right);
                nextLevelCount++;
            }
            if(currentLevelRemaining==0){
                cout<<endl;
                currentLevelRemaining = nextLevelCount;
                nextLevelCount=0;
                flag=false;
            }
        }else{
            BinaryTreeNode<int>* temp = s2.top();
            s2.pop();
            cout<<temp->data<<" ";
            currentLevelRemaining--;
            if(temp->right!=NULL){
                s1.push(temp->right);
                nextLevelCount++;
            }
            if(temp->left!=NULL){
                s1.push(temp->left);
                nextLevelCount++;
            }
            if(currentLevelRemaining==0){
                cout<<endl;
                currentLevelRemaining = nextLevelCount;
                nextLevelCount = 0;
                flag=true;
            }
        }
    }
}
