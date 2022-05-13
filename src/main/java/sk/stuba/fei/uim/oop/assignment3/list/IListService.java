package sk.stuba.fei.uim.oop.assignment3.list;

public interface IListService {

    java.util.List<List> getAllLists();
    List createList();
    List getListById(Long id);
    void deleteListById(Long id);

    List addBookToList(Long id, IdRequest request);
    void removeBookFromList(Long id, IdRequest request);
    void lendList(Long id);

}
