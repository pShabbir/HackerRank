
void decode(String S ,Node root)
    {

          String output;
        Node main=root;
        int i=0;
        while(i<S.length()){
          while(!(root.right==null && root.left==null)){
          switch(S.charAt(i)){
          case '1': root = root.right;
                i++;
              break;
          case '0':root=root.left;
              i++;
              break;
            }

          }
          System.out.print(root.data+"");
          root=main;
        }
    }
