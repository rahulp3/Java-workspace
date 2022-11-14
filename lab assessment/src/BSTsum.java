import java.util.ArrayList;
import java.util.Scanner;

public class BSTsum {

	ArrayList<Integer> nodeList = new ArrayList<>();

	public static Node newNode(int data) {
		Node temp = new Node();
		temp.left = null;
		temp.data = data;
		temp.right = null;

		return temp;

	}

	public void insert(Node root, Node nextNode) {
		if (nextNode.data < root.data) {
			if (root.left == null) {
				root.left = nextNode;
			} else {
				insert(root.left, nextNode);
			}
		} else {
			if (root.right == null) {
				root.right = nextNode;
			} else {
				insert(root.right, nextNode);
			}
		}

	}

	public void traverse(Node root) {
		if (root != null) {
			traverse(root.left);
			nodeList.add(root.data);
			traverse(root.right);
		}
	}

	public static void main(String[] args) {

		BSTsum bst = new BSTsum();
		Node root = null;
		Node nextNode = null;

		// getting the input for number of nodes
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of nodes :");
		int noOfNodes = sc.nextInt();

		// data for the BST
		System.out.println("Enter data for the node :");
		for (int i = 1; i <= noOfNodes; i++) {
			nextNode = newNode(sc.nextInt());

			if (root == null) {
				root = nextNode;
			} else {
				bst.insert(root, nextNode);
			}

		}

		bst.traverse(root);

		System.out.println("Enter the sum : ");
		int sum = sc.nextInt();
		boolean flag = false;

		for (int j = 0; j < noOfNodes; j++) {
			if (bst.nodeList.contains(sum - bst.nodeList.get(j))) {

				int a = bst.nodeList.get(j);
				int b = sum - a;

				// condition to eliminate the condition where same node forms a pair eg :
				// (50,50)
				if (a != b) {
					System.out.println("Pair is (" + a + "," + b + ")");
					flag = true;
					break;
				}

			}
		}

		if (flag == false) {
			System.out.println("Pair not found!");
		}

	}

}
