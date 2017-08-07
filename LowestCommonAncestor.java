static Node lca(Node root,int v1,int v2)
    {
          Node main=root;
          ArrayList<Integer> a1=new ArrayList<>();
          while(!(root.left!=null && root.right!=null)){
            if(v1>root.data){
              if(v1==root.data)
                {
                  a1.add(root.data);
                  break;
                }
                a1.add(root.data);
                root = root.right;
            }else {
              if(v1==root.data)
                {
                  a1.add(root.data);
                  break;
                }
                a1.add(root.data);
                root=root.left;
            }
          }
          root=main;

          //
          ArrayList<Integer> a2=new ArrayList<>();
          while(!(root.left!=null && root.right!=null)){
            if(v2>root.data){
              if(v2==root.data)
                {
                  a2.add(root.data);
                  break;
                }
                a2.add(root.data);
                root = root.right;
            }else {
              if(v2==root.data)
                {
                  a2.add(root.data);
                  break;
                }
                a2.add(root.data);
                root=root.left;
            }
          }
          root=main;
          i=0;
          while(true){
            if(a1.get(i)==a2.get(i)){
              i++;
            }else{
              i--;
              System.out.println(a1.get(i));
              break;
            }
          }

    }
