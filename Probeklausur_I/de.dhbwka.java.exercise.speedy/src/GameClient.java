public interface GameClient {

    public String getPlayerName();
    public int getPoints();
    public void SetQuestion(int questionIndex, Question q);
    public void setRemainingSeconds(int seconds);
    public void gameIsOver();
    public void setAnswerState(int questionIndex, Status status);

}
