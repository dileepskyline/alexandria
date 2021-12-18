package de.tabit.test.alexandria.engine.players;

public class DoublyLinkedList {
	Players head;
	Players tail;
	
	public void add() {
		Players player = new Players();
		if(head == null && tail == null) {
			head = player;
			tail = player;
			player.previousNode = null;
			player.nextNode = null;
		}else {
			tail.nextNode = player;
			player.previousNode=tail;
			tail = player;
			tail.nextNode = null;
		}
	}
	
	public Players getHead() {
		return this.head;
	}

}
