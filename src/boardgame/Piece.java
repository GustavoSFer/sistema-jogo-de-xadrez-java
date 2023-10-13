package boardgame;

public class Piece {
  protected Position position;
  private Board board;

  public Piece(Position position) {
    super();
    this.position = position;
    this.board = null;
  }

  protected Board getPosition() {
    return this.board;
  }
}
