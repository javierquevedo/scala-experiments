package consumption

class Session(duration: Int) {

    private var _duration = 0
    
    def duration = _duration;

    def duration_= (newValue: Int) : Unit = {
        if (newValue < 0 ) printWarning("Smaller than 0") else _duration = newValue
    }

    private def printWarning(msg : String) = println(msg)
}