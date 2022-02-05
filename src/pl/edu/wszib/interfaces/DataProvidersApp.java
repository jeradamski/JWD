package pl.edu.wszib.interfaces;

public class DataProvidersApp {

    public static void main(String[] args) {

        DataPresenter dataPresenter = new DataPresenter();
        DataProvider dataProvider = new SimpleDataProvider();
        DataProvider dataProvider2 = new FileDataProvider();

        dataPresenter.showData(dataProvider);
        dataPresenter.showData(dataProvider2);
    }
}
