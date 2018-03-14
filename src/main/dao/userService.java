package dao;
public class userService(){
    private useDao usedao;
    public void setUserDAO(useDAO usedao){
        this.usedao = usedao;
        }
    public void addUser(){
        useDAO.save();
        }
        public  static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService us = (userService)ac.getBean("UserService");
        us.addUser();
        }
}