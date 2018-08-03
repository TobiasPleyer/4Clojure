;; intoCamelCase - http://www.4clojure.com/problem/102
(fn [s]
  (let [words (clojure.string/split s #"-")]
    (clojure.string/join
      (cons (first words) (map clojure.string/capitalize (rest words))))))
