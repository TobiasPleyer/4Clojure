;; Find Distinct Items - http://www.4clojure.com/problem/56
(defn tmp [s]
  (let [trans (fn [rf]
                (let [seen (atom #{})]
                  (fn
                    ([] (rf))
                    ([final] (rf final))
                    ([acc new]
                      (if (contains? @seen new)
                        acc
                        (do
                          (swap! seen conj new)
                          (rf acc new)))))))]
    (sequence trans s)))
