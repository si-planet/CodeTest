package com.answersheet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Test1260 {

	public static void main(String[] args)	throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// n : 정점의 개수, m :  간선의 개수, v : 시작 번호
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		// 정점 개수로 그래프 생성
		Graph g1 = new Graph(n);
		Graph g2 = new Graph(n);
		
		// 연결 된 간선의 정보 입력하기
		for(int i=1; i<=m ; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			g1.addEdge(num1, num2);
			g2.addEdge(num1, num2);
		}
		br.close();// 입력 끝
		
		bw.append(g1.dfs(v) + "\n");
		bw.append(g2.bfs(v) + "\n");
		
		bw.flush();
		bw.close();
		
	}// end main()

}

class Graph{
	
	class Node{
		int data;	// 노드 번호
		LinkedList<Node> adjacent;	// 인접한 노드 목록
		boolean visit;	// 방문 여부

		// 생성자로 Node 가 생성 될 때
		Node(int data){
			this.data = data;	// 해당 노드 번호 입력
			this.visit = false;	// 아직 탐색 시작 전이므로 false로 초기화
			adjacent = new LinkedList<>();	// 해당 노드에 연결 된 새 LinkedList 목록 부여
		}
	}// end class Node

	Node[] nodes;	// Node 들이 담길 배열
	
	// 생성자 -- 입력 된 고정된 사이즈 만큼의 배열
	// 시작 번호 1로 받기 때문에 size + 1 생성하여 0번 미사용
	Graph(int size){
		nodes = new Node[size+1];
		for(int i=1; i<=size; i++) {
			nodes[i] = new Node(i);
		}
	}
	
	// 간선 추가 메소드
	void addEdge(int num1, int num2) {
		// index 와 data 가 동일하기 때문에 그대로 받을 수 있음
		Node n1 = nodes[num1];
		Node n2 = nodes[num2];
		
		// 연결되어 있지 않다면 서로의 LinkedList 에 추가
		if(!n1.adjacent.contains(n2))
			n1.adjacent.add(n2);
		if(!n2.adjacent.contains(n1))
			n2.adjacent.add(n1);
		
	}
	
	// stack 으로 dfs 구현
	String dfs(int start) {
		StringBuilder sb = new StringBuilder();
		
		Node root = nodes[start];

		Stack<Node> stack = new Stack<>();
		// 제일 처음 생성 된 stack 에서는 꺼낼 요소가 없기 때문에 시작 노드 추가 -> 꺼내기
		stack.push(root);
		root.visit = true;	// 방문 여부를 false -> true 로 변경
		
		// dfs 탐색
		while(!stack.isEmpty())	{
			Node r = stack.pop();	// stack 에 위치한 가장 위쪽의 요소를 꺼내기
			//System.out.println("꺼낸 요소 : " + r.data);
			// 해당 노드의 인접 리스트에서 방문하지 않은 요소들 stack 에 전부 추가
			
			Collections.sort(r.adjacent, (n1, n2) -> Integer.compare(n1.data, n2.data));
			for(Node n : r.adjacent) {
				if(n.visit==false) {
					n.visit=true;	// 방문한 요소로 변경
					stack.push(n);	// stack 에 추가
					//System.out.println("stack 에 추가! : " + n.data);
					break;
				}
			}
			sb.append(r.data + " ");	// stack 에서 꺼낸 요소를 추가
		}
			
		return sb.toString();
	
	}// end dfs()
	
	
	// Queue 로 bfs 구현
	String bfs(int start) {
		
		StringBuilder sb = new StringBuilder();
		Node root = nodes[start];
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(root);	// 시작 데이터 큐에 추가
		root.visit = true;	// 방문 여부 false -> true
		
		// bfs 탐색
		while(!q.isEmpty()) {
			Node r = q.poll();	// queue 의 가장 앞쪽 요소 꺼내기
			
			// 꺼낸 요소의 리스트를 오름차순으로 정렬
			Collections.sort(r.adjacent, (n1, n2) -> Integer.compare(n1.data, n2.data));
			
			// 꺼낸 요소의 인접 요소 순차적으로 큐에 넣기
			for(Node n : r.adjacent) {
				// 방문하지 않은 요소들만 넣기
				if(n.visit==false) {
					n.visit = true;
					q.add(n);
				}
			}
			// 꺼낸 요소 출력
			sb.append(r.data + " ");
		}
		
		return sb.toString();
		
	} // end bfs() 
	
}// end class Graph
