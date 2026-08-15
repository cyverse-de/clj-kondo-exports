(defproject org.cyverse/clj-kondo-exports "0.1.2-SNAPSHOT"
  :description "clj-kondo configuration and macro expansons for third-party libraries"
  :license {:name "BSD"
            :url "https://cyverse.org/license"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  ;; Fail the build on a new dependency conflict rather than printing a
  ;; warning nobody reads.
  :pedantic? :abort
  :dependencies [[org.clojure/clojure "1.12.5"]
                 [korma "0.4.3"]]
  ;; lein-clj-kondo lives in its own profile because its dependency tree is
  ;; internally inconsistent -- clj-kondo pulls Clojure 1.11.4 while its own
  ;; sci dependency pulls 1.12.0 -- which trips :pedantic? :abort on a conflict
  ;; that exists entirely inside a third-party plugin and never reaches the
  ;; runtime classpath. Lint with `lein with-profile +kondo clj-kondo`.
  :profiles {:kondo {:plugins [[com.github.clj-kondo/lein-clj-kondo "2026.08.04"]]
                     :pedantic? :warn}}
  :repl-options {:init-ns clj-kondo-exports.core})
