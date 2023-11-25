package view_LSP;


import data_SRP.User;

import java.util.List;

public interface UserView_LSP<T extends User>{ //Пример LSP тоесть мы можем использовать любого наследника класса User
    void sendOnConsole(List<T> list);
}
