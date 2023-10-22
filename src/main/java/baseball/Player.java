package baseball;

public class Player {
    private static final int PLAYER_MAXIUM_NUM = 999;
    private static final int PLAYER_MINIUM_NUM = 100;
    int player_num;

    public Player(int player_num) {
        this.player_num = player_num;
    }


    void validateNumber(Player player) {
        if (player.player_num > PLAYER_MAXIUM_NUM || player.player_num < PLAYER_MINIUM_NUM)
            throw new IllegalArgumentException("예외입니다.");
    }


}