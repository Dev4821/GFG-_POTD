class Solution{
public:
    long long int sum(Node* root,int dist){/*returns the sum of the Nodes vertically below the targetNode*/
        if(!root) return 0;
        long long int left=sum(root->left,dist-1);
        long long int right=sum(root->right,dist+1);
        return (dist==0)?left+right+root->data:left+right;
    }
    Node* search(Node* root,int target){/*searches for the node whose value is equal to target*/
        while(root){
            if(root->data==target){
                return root;
            }
            else if(root->data<target){
                root=root->right;
            }
            else{
                root=root->left;
            }
        }
        return NULL;
    }
    long long int verticallyDownBST(Node *root,int target){
        Node* targetNode=search(root,target);
        if(targetNode==NULL) return -1;
        return sum(targetNode,0)-targetNode->data;
    }
};
