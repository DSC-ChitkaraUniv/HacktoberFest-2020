class Solution:
    def insertIntoBST(self, root: TreeNode, val: int) -> TreeNode:
        if not root: 
            root = TreeNode(val)
            return root
        
        cur = root
        while cur:
            
            if val > cur.val:
                
                if not cur.right:
                    cur.right = TreeNode(val)
                    break
                else: 
                    cur = cur.right
                    
            else:
                if not cur.left:
                    cur.left = TreeNode(val)
                    break
                else: 
                    cur = cur.left
                    
        return root
