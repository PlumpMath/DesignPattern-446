public class WeatherStation {
    public static void main(String[] args) {
        // 创建主题对象
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
            new CurrentConditionsDisplay();
        currentDisplay.register(weatherData);
        StatisticsDisplay statisticsDisplay =
            new StatisticsDisplay();
        statisticsDisplay.register(weatherData);
        ForecastDisplay forecastDisplay =
            new ForecastDisplay();
        forecastDisplay.register(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
