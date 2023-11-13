package co.chu3la.contract;

import co.chu3la.contract.domain.Transaction;
import co.chu3la.contract.repository.TransactionRepository;
import org.hibernate.engine.spi.SessionImplementor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@ComponentScan(basePackages = {"co.chu3la.contract.repository",
		"co.chu3la.contract.service",
		"co.chu3la.contract.controller",
		"co.chu3la.contract.domain"
})
public class ContractApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContractApplication.class, args);
	}

	@Bean
	public TransactionRepository transactionRepository() {
		return new TransactionRepository() {
			@Override
			public List<Transaction> findAll() {
				return null;
			}

			@Override
			public List<Transaction> findAll(Sort sort) {
				return null;
			}

			@Override
			public Page<Transaction> findAll(Pageable pageable) {
				return null;
			}

			@Override
			public List<Transaction> findAllById(Iterable<Long> iterable) {
				return null;
			}

			@Override
			public long count() {
				return 0;
			}

			@Override
			public void deleteById(Long aLong) {

			}

			@Override
			public void delete(Transaction transaction) {

			}

			@Override
			public void deleteAllById(Iterable<? extends Long> iterable) {

			}

			@Override
			public void deleteAll(Iterable<? extends Transaction> iterable) {

			}

			@Override
			public void deleteAll() {

			}

			@Override
			public <S extends Transaction> S save(S s) {
				return null;
			}

			@Override
			public <S extends Transaction> List<S> saveAll(Iterable<S> iterable) {
				return null;
			}

			@Override
			public Optional<Transaction> findById(Long aLong) {
				return Optional.empty();
			}

			@Override
			public boolean existsById(Long aLong) {
				return false;
			}

			@Override
			public void flush() {

			}

			@Override
			public <S extends Transaction> S saveAndFlush(S s) {
				return null;
			}

			@Override
			public <S extends Transaction> List<S> saveAllAndFlush(Iterable<S> iterable) {
				return null;
			}

			@Override
			public void deleteAllInBatch(Iterable<Transaction> iterable) {

			}

			@Override
			public void deleteAllByIdInBatch(Iterable<Long> iterable) {

			}

			@Override
			public void deleteAllInBatch() {

			}

			/**
			 * @param aLong
			 * @deprecated
			 */
			@Override
			public Transaction getOne(Long aLong) {
				return null;
			}

			@Override
			public Transaction getById(Long aLong) {
				return null;
			}

			@Override
			public <S extends Transaction> Optional<S> findOne(Example<S> example) {
				return Optional.empty();
			}

			@Override
			public <S extends Transaction> List<S> findAll(Example<S> example) {
				return null;
			}

			@Override
			public <S extends Transaction> List<S> findAll(Example<S> example, Sort sort) {
				return null;
			}

			@Override
			public <S extends Transaction> Page<S> findAll(Example<S> example, Pageable pageable) {
				return null;
			}

			@Override
			public <S extends Transaction> long count(Example<S> example) {
				return 0;
			}

			@Override
			public <S extends Transaction> boolean exists(Example<S> example) {
				return false;
			}

			@Override
			public List<Transaction> findAllByAccountNumber(String accountNumber) {
				return null;
			}
		};
	}



}
