interface Subscriber {
    fun update(news: String)
}

interface NewsPoster {
    fun subscribe(subscriber: Subscriber)
    fun unsubscribe(subscriber: Subscriber)
    fun notifySubscribers(news: String)
}

class NewsPublisher : NewsPoster {
    private val subscribers = mutableListOf<Subscriber>()

    override fun subscribe(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }

    override fun unsubscribe(subscriber: Subscriber) {
        subscribers.remove(subscriber)
    }

    override fun notifySubscribers(news: String) {
        for (subscriber in subscribers) {
            subscriber.update(news)
        }
    }

    fun postNews(news: String) {
        println("Опубликована новость: $news")
        notifySubscribers(news)
    }
}

class ConcreteSubscriber(private val name: String) : Subscriber {
    override fun update(news: String) {
        println("$name получил новость: $news")
    }
}

fun main() {
    val newsPublisher = NewsPublisher()

    val subscriber1 = ConcreteSubscriber("Пользователь1")
    val subscriber2 = ConcreteSubscriber("Пользователь2")

    newsPublisher.subscribe(subscriber1)
    newsPublisher.subscribe(subscriber2)

    newsPublisher.postNews("Новость1")

    newsPublisher.unsubscribe(subscriber1)

    newsPublisher.postNews("Новость2")
}
