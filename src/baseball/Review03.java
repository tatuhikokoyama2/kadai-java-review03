package baseball;

public class Review03 {

    public static void main(String[] args) {
        // チームのインスタンスを生成
        BaseBallTeam swallows = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam baystars = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam tigers = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam giants = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam carp = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam dragons = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        //東京ヤクルトスワローズの情報を取得し表示
        swallows.report(swallows);

        //横浜DeNAベイスターズの情報を取得し表示
        baystars.report(baystars);

        //阪神タイガースの情報を取得し表示
        tigers.report(tigers);

        //読売ジャイアンツの情報を取得し表示
        giants.report(giants);

        //広島東洋カープの情報を取得し表示
        carp.report(carp);

        //中日ドラゴンズの情報を取得し表示
        dragons.report(dragons);
    }

}
