package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";
        reviews[1] = aboutTime;

        for (int i = 0; i < reviews.length; i++) {
            System.out.println("영화 제목: " + reviews[i].title + ", 리뷰: " + reviews[i].review);
        }

        for (int i = 0; i < reviews.length; i++) {
            MovieReview mv = reviews[i];
            System.out.println("영화 제목: " + mv.title + ", 리뷰: " + mv.review);
        }

        for (MovieReview mv : reviews) {
            System.out.println("영화 제목: " + mv.title + ", 리뷰: " + mv.review);
        } // 향상된 for문 최적화
    }
}
