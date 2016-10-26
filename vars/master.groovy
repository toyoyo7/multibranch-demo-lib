// vars/master.groovy
def call(Closure body) {
    node('master') {
        body()
    }
}
