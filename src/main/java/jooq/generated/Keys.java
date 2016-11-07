/**
 * This class is generated by jOOQ
 */
package jooq.generated;


import javax.annotation.Generated;

import jooq.generated.tables.Company;
import jooq.generated.tables.Document;
import jooq.generated.tables.Image;
import jooq.generated.tables.Job;
import jooq.generated.tables.JobApp;
import jooq.generated.tables.JobAppPackage;
import jooq.generated.tables.JobInterview;
import jooq.generated.tables.JobMine;
import jooq.generated.tables.JobOffer;
import jooq.generated.tables.Location;
import jooq.generated.tables.School;
import jooq.generated.tables.Student;
import jooq.generated.tables.records.CompanyRecord;
import jooq.generated.tables.records.DocumentRecord;
import jooq.generated.tables.records.ImageRecord;
import jooq.generated.tables.records.JobAppPackageRecord;
import jooq.generated.tables.records.JobAppRecord;
import jooq.generated.tables.records.JobInterviewRecord;
import jooq.generated.tables.records.JobMineRecord;
import jooq.generated.tables.records.JobOfferRecord;
import jooq.generated.tables.records.JobRecord;
import jooq.generated.tables.records.LocationRecord;
import jooq.generated.tables.records.SchoolRecord;
import jooq.generated.tables.records.StudentRecord;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<CompanyRecord, Long> IDENTITY_COMPANY = Identities0.IDENTITY_COMPANY;
	public static final Identity<DocumentRecord, Long> IDENTITY_DOCUMENT = Identities0.IDENTITY_DOCUMENT;
	public static final Identity<ImageRecord, Long> IDENTITY_IMAGE = Identities0.IDENTITY_IMAGE;
	public static final Identity<JobRecord, Long> IDENTITY_JOB = Identities0.IDENTITY_JOB;
	public static final Identity<JobAppRecord, Long> IDENTITY_JOB_APP = Identities0.IDENTITY_JOB_APP;
	public static final Identity<JobAppPackageRecord, Long> IDENTITY_JOB_APP_PACKAGE = Identities0.IDENTITY_JOB_APP_PACKAGE;
	public static final Identity<JobInterviewRecord, Long> IDENTITY_JOB_INTERVIEW = Identities0.IDENTITY_JOB_INTERVIEW;
	public static final Identity<JobMineRecord, Long> IDENTITY_JOB_MINE = Identities0.IDENTITY_JOB_MINE;
	public static final Identity<JobOfferRecord, Long> IDENTITY_JOB_OFFER = Identities0.IDENTITY_JOB_OFFER;
	public static final Identity<LocationRecord, Long> IDENTITY_LOCATION = Identities0.IDENTITY_LOCATION;
	public static final Identity<SchoolRecord, Long> IDENTITY_SCHOOL = Identities0.IDENTITY_SCHOOL;
	public static final Identity<StudentRecord, Long> IDENTITY_STUDENT = Identities0.IDENTITY_STUDENT;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<CompanyRecord> COMPANY_PKEY = UniqueKeys0.COMPANY_PKEY;
	public static final UniqueKey<DocumentRecord> DOCUMENT_PKEY = UniqueKeys0.DOCUMENT_PKEY;
	public static final UniqueKey<ImageRecord> IMAGE_PKEY = UniqueKeys0.IMAGE_PKEY;
	public static final UniqueKey<JobRecord> JOB_PKEY = UniqueKeys0.JOB_PKEY;
	public static final UniqueKey<JobAppRecord> JOB_APP_PKEY = UniqueKeys0.JOB_APP_PKEY;
	public static final UniqueKey<JobAppPackageRecord> JOB_APP_PACKAGE_PKEY = UniqueKeys0.JOB_APP_PACKAGE_PKEY;
	public static final UniqueKey<JobInterviewRecord> JOB_INTERVIEW_PKEY = UniqueKeys0.JOB_INTERVIEW_PKEY;
	public static final UniqueKey<JobMineRecord> JOB_MINE_PKEY = UniqueKeys0.JOB_MINE_PKEY;
	public static final UniqueKey<JobOfferRecord> JOB_OFFER_PKEY = UniqueKeys0.JOB_OFFER_PKEY;
	public static final UniqueKey<LocationRecord> LOCATION_PKEY = UniqueKeys0.LOCATION_PKEY;
	public static final UniqueKey<SchoolRecord> SCHOOL_PKEY = UniqueKeys0.SCHOOL_PKEY;
	public static final UniqueKey<StudentRecord> STUDENT_PKEY = UniqueKeys0.STUDENT_PKEY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<CompanyRecord, LocationRecord> COMPANY__COMPANY_LOCATION_LOCATION_ID_FK = ForeignKeys0.COMPANY__COMPANY_LOCATION_LOCATION_ID_FK;
	public static final ForeignKey<CompanyRecord, ImageRecord> COMPANY__COMPANY_IMAGE_IMAGE_ID_FK = ForeignKeys0.COMPANY__COMPANY_IMAGE_IMAGE_ID_FK;
	public static final ForeignKey<CompanyRecord, JobMineRecord> COMPANY__COMPANY_JOB_MINE_JOB_MINE_ID_FK = ForeignKeys0.COMPANY__COMPANY_JOB_MINE_JOB_MINE_ID_FK;
	public static final ForeignKey<DocumentRecord, JobAppPackageRecord> DOCUMENT__DOCUMENT_JOB_APP_PACKAGE_JOB_APP_PACKAGE_ID_FK = ForeignKeys0.DOCUMENT__DOCUMENT_JOB_APP_PACKAGE_JOB_APP_PACKAGE_ID_FK;
	public static final ForeignKey<JobRecord, JobMineRecord> JOB__JOB_JOB_MINE_JOB_MINE_ID_FK = ForeignKeys0.JOB__JOB_JOB_MINE_JOB_MINE_ID_FK;
	public static final ForeignKey<JobRecord, CompanyRecord> JOB__JOB_COMPANY_COMPANY_ID_FK = ForeignKeys0.JOB__JOB_COMPANY_COMPANY_ID_FK;
	public static final ForeignKey<JobRecord, LocationRecord> JOB__JOB_LOCATION_LOCATION_ID_FK = ForeignKeys0.JOB__JOB_LOCATION_LOCATION_ID_FK;
	public static final ForeignKey<JobAppRecord, JobRecord> JOB_APP__JOB_APP_JOB_JOB_ID_FK = ForeignKeys0.JOB_APP__JOB_APP_JOB_JOB_ID_FK;
	public static final ForeignKey<JobAppRecord, JobAppPackageRecord> JOB_APP__JOB_APP_JOB_APP_PACKAGE_JOB_APP_PACKAGE_ID_FK = ForeignKeys0.JOB_APP__JOB_APP_JOB_APP_PACKAGE_JOB_APP_PACKAGE_ID_FK;
	public static final ForeignKey<JobAppPackageRecord, StudentRecord> JOB_APP_PACKAGE__JOB_APP_PACKAGE_STUDENT_STUDENT_ID_FK = ForeignKeys0.JOB_APP_PACKAGE__JOB_APP_PACKAGE_STUDENT_STUDENT_ID_FK;
	public static final ForeignKey<JobInterviewRecord, JobRecord> JOB_INTERVIEW__JOB_INTERVIEW_JOB_JOB_ID_FK = ForeignKeys0.JOB_INTERVIEW__JOB_INTERVIEW_JOB_JOB_ID_FK;
	public static final ForeignKey<JobInterviewRecord, StudentRecord> JOB_INTERVIEW__JOB_INTERVIEW_STUDENT_STUDENT_ID_FK = ForeignKeys0.JOB_INTERVIEW__JOB_INTERVIEW_STUDENT_STUDENT_ID_FK;
	public static final ForeignKey<JobInterviewRecord, LocationRecord> JOB_INTERVIEW__JOB_INTERVIEW_LOCATION_LOCATION_ID_FK = ForeignKeys0.JOB_INTERVIEW__JOB_INTERVIEW_LOCATION_LOCATION_ID_FK;
	public static final ForeignKey<JobOfferRecord, JobRecord> JOB_OFFER__JOB_OFFER_JOB_JOB_ID_FK = ForeignKeys0.JOB_OFFER__JOB_OFFER_JOB_JOB_ID_FK;
	public static final ForeignKey<JobOfferRecord, StudentRecord> JOB_OFFER__JOB_OFFER_STUDENT_STUDENT_ID_FK = ForeignKeys0.JOB_OFFER__JOB_OFFER_STUDENT_STUDENT_ID_FK;
	public static final ForeignKey<SchoolRecord, LocationRecord> SCHOOL__SCHOOL_LOCATION_LOCATION_ID_FK = ForeignKeys0.SCHOOL__SCHOOL_LOCATION_LOCATION_ID_FK;
	public static final ForeignKey<SchoolRecord, ImageRecord> SCHOOL__SCHOOL_IMAGE_IMAGE_ID_FK = ForeignKeys0.SCHOOL__SCHOOL_IMAGE_IMAGE_ID_FK;
	public static final ForeignKey<SchoolRecord, JobMineRecord> SCHOOL__SCHOOL_JOB_MINE_JOB_MINE_ID_FK = ForeignKeys0.SCHOOL__SCHOOL_JOB_MINE_JOB_MINE_ID_FK;
	public static final ForeignKey<StudentRecord, SchoolRecord> STUDENT__STUDENT_SCHOOL_SCHOOL_ID_FK = ForeignKeys0.STUDENT__STUDENT_SCHOOL_SCHOOL_ID_FK;
	public static final ForeignKey<StudentRecord, LocationRecord> STUDENT__STUDENT_LOCATION_LOCATION_ID_FK = ForeignKeys0.STUDENT__STUDENT_LOCATION_LOCATION_ID_FK;
	public static final ForeignKey<StudentRecord, ImageRecord> STUDENT__STUDENT_IMAGE_IMAGE_ID_FK = ForeignKeys0.STUDENT__STUDENT_IMAGE_IMAGE_ID_FK;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<CompanyRecord, Long> IDENTITY_COMPANY = createIdentity(Company.COMPANY, Company.COMPANY.COMPANY_ID);
		public static Identity<DocumentRecord, Long> IDENTITY_DOCUMENT = createIdentity(Document.DOCUMENT, Document.DOCUMENT.DOCUMENT_ID);
		public static Identity<ImageRecord, Long> IDENTITY_IMAGE = createIdentity(Image.IMAGE, Image.IMAGE.IMAGE_ID);
		public static Identity<JobRecord, Long> IDENTITY_JOB = createIdentity(Job.JOB, Job.JOB.JOB_ID);
		public static Identity<JobAppRecord, Long> IDENTITY_JOB_APP = createIdentity(JobApp.JOB_APP, JobApp.JOB_APP.JOB_APP_ID);
		public static Identity<JobAppPackageRecord, Long> IDENTITY_JOB_APP_PACKAGE = createIdentity(JobAppPackage.JOB_APP_PACKAGE, JobAppPackage.JOB_APP_PACKAGE.JOB_APP_PACKAGE_ID);
		public static Identity<JobInterviewRecord, Long> IDENTITY_JOB_INTERVIEW = createIdentity(JobInterview.JOB_INTERVIEW, JobInterview.JOB_INTERVIEW.JOB_INTERVIEW_ID);
		public static Identity<JobMineRecord, Long> IDENTITY_JOB_MINE = createIdentity(JobMine.JOB_MINE, JobMine.JOB_MINE.JOB_MINE_ID);
		public static Identity<JobOfferRecord, Long> IDENTITY_JOB_OFFER = createIdentity(JobOffer.JOB_OFFER, JobOffer.JOB_OFFER.JOB_OFFER_ID);
		public static Identity<LocationRecord, Long> IDENTITY_LOCATION = createIdentity(Location.LOCATION, Location.LOCATION.LOCATION_ID);
		public static Identity<SchoolRecord, Long> IDENTITY_SCHOOL = createIdentity(School.SCHOOL, School.SCHOOL.SCHOOL_ID);
		public static Identity<StudentRecord, Long> IDENTITY_STUDENT = createIdentity(Student.STUDENT, Student.STUDENT.STUDENT_ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<CompanyRecord> COMPANY_PKEY = createUniqueKey(Company.COMPANY, Company.COMPANY.COMPANY_ID);
		public static final UniqueKey<DocumentRecord> DOCUMENT_PKEY = createUniqueKey(Document.DOCUMENT, Document.DOCUMENT.DOCUMENT_ID);
		public static final UniqueKey<ImageRecord> IMAGE_PKEY = createUniqueKey(Image.IMAGE, Image.IMAGE.IMAGE_ID);
		public static final UniqueKey<JobRecord> JOB_PKEY = createUniqueKey(Job.JOB, Job.JOB.JOB_ID);
		public static final UniqueKey<JobAppRecord> JOB_APP_PKEY = createUniqueKey(JobApp.JOB_APP, JobApp.JOB_APP.JOB_APP_ID);
		public static final UniqueKey<JobAppPackageRecord> JOB_APP_PACKAGE_PKEY = createUniqueKey(JobAppPackage.JOB_APP_PACKAGE, JobAppPackage.JOB_APP_PACKAGE.JOB_APP_PACKAGE_ID);
		public static final UniqueKey<JobInterviewRecord> JOB_INTERVIEW_PKEY = createUniqueKey(JobInterview.JOB_INTERVIEW, JobInterview.JOB_INTERVIEW.JOB_INTERVIEW_ID);
		public static final UniqueKey<JobMineRecord> JOB_MINE_PKEY = createUniqueKey(JobMine.JOB_MINE, JobMine.JOB_MINE.JOB_MINE_ID);
		public static final UniqueKey<JobOfferRecord> JOB_OFFER_PKEY = createUniqueKey(JobOffer.JOB_OFFER, JobOffer.JOB_OFFER.JOB_OFFER_ID);
		public static final UniqueKey<LocationRecord> LOCATION_PKEY = createUniqueKey(Location.LOCATION, Location.LOCATION.LOCATION_ID);
		public static final UniqueKey<SchoolRecord> SCHOOL_PKEY = createUniqueKey(School.SCHOOL, School.SCHOOL.SCHOOL_ID);
		public static final UniqueKey<StudentRecord> STUDENT_PKEY = createUniqueKey(Student.STUDENT, Student.STUDENT.STUDENT_ID);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<CompanyRecord, LocationRecord> COMPANY__COMPANY_LOCATION_LOCATION_ID_FK = createForeignKey(jooq.generated.Keys.LOCATION_PKEY, Company.COMPANY, Company.COMPANY.LOCATION_ID);
		public static final ForeignKey<CompanyRecord, ImageRecord> COMPANY__COMPANY_IMAGE_IMAGE_ID_FK = createForeignKey(jooq.generated.Keys.IMAGE_PKEY, Company.COMPANY, Company.COMPANY.IMAGE_ID);
		public static final ForeignKey<CompanyRecord, JobMineRecord> COMPANY__COMPANY_JOB_MINE_JOB_MINE_ID_FK = createForeignKey(jooq.generated.Keys.JOB_MINE_PKEY, Company.COMPANY, Company.COMPANY.JOB_MINE_ID);
		public static final ForeignKey<DocumentRecord, JobAppPackageRecord> DOCUMENT__DOCUMENT_JOB_APP_PACKAGE_JOB_APP_PACKAGE_ID_FK = createForeignKey(jooq.generated.Keys.JOB_APP_PACKAGE_PKEY, Document.DOCUMENT, Document.DOCUMENT.JOB_APP_PACKAGE_ID);
		public static final ForeignKey<JobRecord, JobMineRecord> JOB__JOB_JOB_MINE_JOB_MINE_ID_FK = createForeignKey(jooq.generated.Keys.JOB_MINE_PKEY, Job.JOB, Job.JOB.JOB_MINE_ID);
		public static final ForeignKey<JobRecord, CompanyRecord> JOB__JOB_COMPANY_COMPANY_ID_FK = createForeignKey(jooq.generated.Keys.COMPANY_PKEY, Job.JOB, Job.JOB.COMPANY_ID);
		public static final ForeignKey<JobRecord, LocationRecord> JOB__JOB_LOCATION_LOCATION_ID_FK = createForeignKey(jooq.generated.Keys.LOCATION_PKEY, Job.JOB, Job.JOB.LOCATION_ID);
		public static final ForeignKey<JobAppRecord, JobRecord> JOB_APP__JOB_APP_JOB_JOB_ID_FK = createForeignKey(jooq.generated.Keys.JOB_PKEY, JobApp.JOB_APP, JobApp.JOB_APP.JOB_ID);
		public static final ForeignKey<JobAppRecord, JobAppPackageRecord> JOB_APP__JOB_APP_JOB_APP_PACKAGE_JOB_APP_PACKAGE_ID_FK = createForeignKey(jooq.generated.Keys.JOB_APP_PACKAGE_PKEY, JobApp.JOB_APP, JobApp.JOB_APP.JOB_APP_PACKAGE_ID);
		public static final ForeignKey<JobAppPackageRecord, StudentRecord> JOB_APP_PACKAGE__JOB_APP_PACKAGE_STUDENT_STUDENT_ID_FK = createForeignKey(jooq.generated.Keys.STUDENT_PKEY, JobAppPackage.JOB_APP_PACKAGE, JobAppPackage.JOB_APP_PACKAGE.STUDENT_ID);
		public static final ForeignKey<JobInterviewRecord, JobRecord> JOB_INTERVIEW__JOB_INTERVIEW_JOB_JOB_ID_FK = createForeignKey(jooq.generated.Keys.JOB_PKEY, JobInterview.JOB_INTERVIEW, JobInterview.JOB_INTERVIEW.JOB_ID);
		public static final ForeignKey<JobInterviewRecord, StudentRecord> JOB_INTERVIEW__JOB_INTERVIEW_STUDENT_STUDENT_ID_FK = createForeignKey(jooq.generated.Keys.STUDENT_PKEY, JobInterview.JOB_INTERVIEW, JobInterview.JOB_INTERVIEW.STUDENT_ID);
		public static final ForeignKey<JobInterviewRecord, LocationRecord> JOB_INTERVIEW__JOB_INTERVIEW_LOCATION_LOCATION_ID_FK = createForeignKey(jooq.generated.Keys.LOCATION_PKEY, JobInterview.JOB_INTERVIEW, JobInterview.JOB_INTERVIEW.LOCATION_ID);
		public static final ForeignKey<JobOfferRecord, JobRecord> JOB_OFFER__JOB_OFFER_JOB_JOB_ID_FK = createForeignKey(jooq.generated.Keys.JOB_PKEY, JobOffer.JOB_OFFER, JobOffer.JOB_OFFER.JOB_ID);
		public static final ForeignKey<JobOfferRecord, StudentRecord> JOB_OFFER__JOB_OFFER_STUDENT_STUDENT_ID_FK = createForeignKey(jooq.generated.Keys.STUDENT_PKEY, JobOffer.JOB_OFFER, JobOffer.JOB_OFFER.STUDENT_ID);
		public static final ForeignKey<SchoolRecord, LocationRecord> SCHOOL__SCHOOL_LOCATION_LOCATION_ID_FK = createForeignKey(jooq.generated.Keys.LOCATION_PKEY, School.SCHOOL, School.SCHOOL.LOCATION_ID);
		public static final ForeignKey<SchoolRecord, ImageRecord> SCHOOL__SCHOOL_IMAGE_IMAGE_ID_FK = createForeignKey(jooq.generated.Keys.IMAGE_PKEY, School.SCHOOL, School.SCHOOL.IMAGE_ID);
		public static final ForeignKey<SchoolRecord, JobMineRecord> SCHOOL__SCHOOL_JOB_MINE_JOB_MINE_ID_FK = createForeignKey(jooq.generated.Keys.JOB_MINE_PKEY, School.SCHOOL, School.SCHOOL.JOB_MINE_ID);
		public static final ForeignKey<StudentRecord, SchoolRecord> STUDENT__STUDENT_SCHOOL_SCHOOL_ID_FK = createForeignKey(jooq.generated.Keys.SCHOOL_PKEY, Student.STUDENT, Student.STUDENT.SCHOOL_ID);
		public static final ForeignKey<StudentRecord, LocationRecord> STUDENT__STUDENT_LOCATION_LOCATION_ID_FK = createForeignKey(jooq.generated.Keys.LOCATION_PKEY, Student.STUDENT, Student.STUDENT.LOCATION_ID);
		public static final ForeignKey<StudentRecord, ImageRecord> STUDENT__STUDENT_IMAGE_IMAGE_ID_FK = createForeignKey(jooq.generated.Keys.IMAGE_PKEY, Student.STUDENT, Student.STUDENT.IMAGE_ID);
	}
}