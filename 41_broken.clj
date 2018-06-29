;; Drop Every Nth Item - http://www.4clojure.com/problem/41
;; Works in my REPL, but the 4clojure sandbox doesn't know transduce
(defn drop-every-nth [s n]
  (let [xf (fn [rf]
             (let [index (atom 1)]
               (fn
                 ([] (rf))
                 ([result] (rf result))
                 ([result input]
                  (let [curr-index @index]
                    (swap! index inc)
                    (if (= 0 (mod curr-index n))
                      result
                      (rf result input)))))))]
    (transduce xf conj s)))