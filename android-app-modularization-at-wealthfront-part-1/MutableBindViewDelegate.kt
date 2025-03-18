fun <T : View> View.bindView(@IdRes res: Int): MutableBindViewDelegate<T> {
  return MutableBindViewDelegate(lazy(LazyThreadSafetyMode.NONE) { findViewById<T>(res)!! })
}

class MutableBindViewDelegate<T>(private val lazy: Lazy<T>) {

  private var value: T? = null

  operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
    return value ?: lazy.getValue(thisRef, property)
  }

  operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
    this.value = value
  }
}

// Usage:
var title: TextView by bindView(R.id.title)
var body: TextView by bindView(R.id.body)
var ctaButton: Button by bindView(R.id.ctaButton)
var tagView: TextView by bindView(R.id.tagView)
