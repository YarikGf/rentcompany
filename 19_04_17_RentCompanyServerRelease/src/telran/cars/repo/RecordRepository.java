package telran.cars.repo;

import java.time.LocalDate;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.cars.entities.RecordJpa;

public interface RecordRepository extends
JpaRepository<RecordJpa, Long> {

	RecordJpa findByCarRegNumberAndReturnDateNull(String regNumber);

	Stream<RecordJpa> findByDriverLicenseId(long licenseId);

	Stream<RecordJpa> findByCarRegNumber(String regNumber);

	Stream<RecordJpa> findByRentDateBetween(LocalDate from, LocalDate to);


}
