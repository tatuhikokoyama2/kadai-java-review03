package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

    //引数なしのコンストラクタ
    public BaseBallTeam() {

    }

    //引数ありコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //勝率のメソッド(引数にはチームを指定)
    public double getRate(BaseBallTeam team) {
        //勝率の計算
        double winRate = (double)this.win / (double)(team.win + team.lose);

        //勝率を返す
        return winRate;
    }

    //勝率表示のメソッド(引数にはチームを指定)
    public void report(BaseBallTeam team) {

        //勝率をgetRateから受け取る
        double winRate = getRate(team);

        System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + winRate + "です。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }
}
