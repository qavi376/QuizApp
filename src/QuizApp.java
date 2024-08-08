public class QuizApp {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Add questions to the quiz
        String[] options1 = {"Java", "Python", "C++", "JavaScript"};
        quiz.addQuestion(new Question("Which programming language is this quiz written in?", options1, 'A'));

        String[] options2 = {"16 bits", "32 bits", "64 bits", "8 bits"};
        quiz.addQuestion(new Question("How many Bits make one Byte?", options2, 'D'));

        String[] options3 = {"Andrew N", "Charles Babbage", "Mark Zuckerberg", "Dinnis Ritchie"};
        quiz.addQuestion(new Question("Who is called the Father of Computer ?", options3, 'B'));
        
        String[] options4 = {"Glass", "Hybrid", "Optical", "All of the above"};
        quiz.addQuestion(new Question("Which technology is used in CDROM Drive?", options4, 'C'));
        
        String[] options5 = {"Tim Paterson", "Andrew N", "Bill Gates", "Dennis Ritchie"};
        quiz.addQuestion(new Question("Who was the programmer of the MS-DOS operating system?", options5, 'A'));


        // Administer the quiz
        quiz.administer();
    }
}
