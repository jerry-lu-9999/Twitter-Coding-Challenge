public class Puzzle1 {

  // Simplified Huffman Encoding
  //
  // Huffman Encoding enables data to be stored in 1's and 0's.
  // The 1's and 0's can then be reduced to bytes.  This encoding is an example of data compression.
  //
  // Encoding and decoding is based on a binary tree structure.
  // 0 <- go left
  // 1 <- go right
  // Keep going left and right until you get to a leaf.  The value in the leaf is the decoded
  // symbol.
  //
  // Tree Structure
  // (x)       <-- leaf node
  // ((a)|(b)) <-- tree with a in left branch and b in right branch

  // TEST EXAMPLES
  public static final String sample1 = "rat";
  public static final String sampleMessage1 = "10110";
  public static final String sample2 = "tar";
  public static final String sampleMessage2 = "01110";
  public static final String sample3 = "art";
  public static final String sampleMessage3 = "11100";

  public static final Node sampleTree =
      new Node(null,
          new Node('t',null,null),
          new Node(null,
              new Node('r',null,null),
              new Node('a',null,null)));

  // TEST YOUR TREE:
  public static final Node SECRET_TREE = 
      new Node(null,
          new Node(null,
              new Node('t',null,null),
              new Node(null,
                  new Node('w',null,null),
                  new Node('a',null,null))),
          new Node(null,
              new Node(null,
                  new Node('r',null,null),
                  new Node(null,
                      new Node('p',null,null),
                      new Node('i',null,null))),
              new Node(null,
                  new Node(null,
                      new Node('c',null,null),
                      new Node('k',null,null)),
                  new Node(null,
                      new Node('s',null,null),
                      new Node('e',null,null)))));

  public static final String code1 = "111000011100";
  public static final String word1 = "star";
  public static final String code2 = "1010101111001101";
  public static final String word2 = "pick";
  public static final String code3 = "010111100";
  public static final String word3 = "wet";

  // DECODE THIS: to get your puzzle piece!
  public static final String message = "101001100100101111001101111000111101001110000";


  public static class Node {
    Character value = null;
    Node left = null;
    Node right = null;

    public Node(Character value, Node left, Node right) {
      this.value = value;
      this.left = left;
      this.right = right;
    }

    public Character getValue() {
      return this.value;
    }

    public Node getLeft() {
      return this.left;
    }

    public Node getRight() {
      return this.right;
    }

    public boolean isLeaf() {
      return (left == null && right == null);
    }
  }

  public static class Decoder {
    char ch;
    String str;
    String em = "";
    public String decodeMessage(Node tree, String message) {
          //  Node currentNode = new Node();
    Node currentNode = tree;

    for(int i = 0; i < message.length(); i++){
        if(message.charAt(i) == '0' && !currentNode.isLeaf()){
          currentNode = currentNode.getLeft();
          if(currentNode.isLeaf()){
            em = em + Character.toString(currentNode.getValue());
            currentNode = tree;
          }
        } else if(message.charAt(i) == '1' && !currentNode.isLeaf()){
          currentNode = currentNode.getRight();
          if(currentNode.isLeaf()){
            em = em + Character.toString(currentNode.getValue());
            currentNode = tree;
          }
        }
    }
    return em;
    }
  }  

  public static void main(String[] args) throws Exception {
    Decoder decoder = new Decoder();
    System.out.println(decoder.decodeMessage(SECRET_TREE, message));
  }
}
